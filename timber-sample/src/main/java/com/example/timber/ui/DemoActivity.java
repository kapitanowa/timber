savedI    Timber.tag("LifeCycles");
    Timber.d("Activity Created");

    binding.hello.setOnClickListener(this)
    binding.hey.setOnClickListener(this)
    binding.hi.setOnClickListener(this)
  

  @Override public void onClick(View v) 
    Button button = (Button) v;
    Timber.i("A button with ID %s was clicked to say '%s'.", button.getId(), button.getText());
    Toast.makeText(this, "Check logcat for a greeting!", LENGTH_SHORT).
