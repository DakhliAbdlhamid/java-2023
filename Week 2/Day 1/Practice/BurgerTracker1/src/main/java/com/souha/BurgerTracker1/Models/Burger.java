package com.souha.BurgerTracker1.Models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

	@Entity
	@Table(name="burger")
	public class Burger {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotNull
	    @Size(min = 5, max = 200,message="you need a title!!!!")
	    private String burgername;
	    @NotNull
	    @Size(min = 5, max = 200 , message="you need a resto name!!!!")
	    private String restaurantname;
	    @NotNull
	    @Min(10)
	    private Integer rating;
	    @NotNull
	    @Size(min = 5, max = 200 , message="you need a title!!!!")
	    private String notes;
	    // This will not allow the createdAt column to be updated after creation
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Burger() {
	    }
	    public Burger(String burgername, String restaurantname,int rating, String notes) {
	        this.burgername = burgername;
	        this.restaurantname = restaurantname;
	        this.rating = rating;
	        this.notes = notes;
	    }
	    
	    // other getters and setters removed for brevity
	    public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getBurgername() {
			return burgername;
		}
		public void setBurgername(String burgername) {
			this.burgername = burgername;
		}
		public String getRestaurantname() {
			return restaurantname;
		}
		public void setRestaurantname(String restaurantname) {
			this.restaurantname = restaurantname;
		}
		public Integer getRating() {
			return rating;
		}
		public void setRating(Integer rating) {
			this.rating = rating;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
